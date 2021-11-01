public class PersonalStatus {
    private int weight; // 무게
    private String sex; // 성별
    private int height; // 키
    private int properWeight;

    // setter, getter 없이 생성자로 바로 객체 생성
    public PersonalStatus(int weight, String sex, int height) {
        this.weight = weight;
        this.sex = sex;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonalStatus{" +
                "weight=" + weight +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    public boolean isCorrectType (int weight, String sex, int height){
        if (sex.toUpperCase().equals("BOY")||sex.toUpperCase().equals("GIRL")){
            if (height>0 && height<230){
                if (weight>0 && weight<230) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false; // 올바르지 않다면 거짓으로 반환 ( 거짓일때 올바른 형태일때까지 반복 )
    }
    // 올바른 형태로 입력이 되었다면 아래 진행
    public int getProperWeight(){
        if (isCorrectType(weight,sex,height)==true){
            if (sex.toUpperCase().equals("BOY")){
                properWeight = height*height*23/10000;
            }
            else {
                properWeight = height*height*22/10000;
            }
        }
        else {
            properWeight = 0;
        }
        return properWeight;
    }

    /*
        18.5 이하 : 저체중
        18.6~22.9 : 정상
        23~ 24.9 : 과체중
        25~29.9 : 비만
        30 이상 : 고도 비만
    */
    public String getBmi() {
        double bmi=0;
        String status="";
        bmi = weight/(height*height/10000);
        if (bmi <= 18.5){
            status += "저체중";
        }
        else if (bmi <= 22.9){
            status += "정상";
        }
        else if (bmi <= 24.9){
            status += "과체중";
        }
        else if (bmi <= 29.9){
            status += "비만";
        }
        else {
            status += "고도 비만";
        }
        return String.format("당신의 BMI수치는 : %.2f \n현재 상태 : %s\n",bmi,status);
    }

}
