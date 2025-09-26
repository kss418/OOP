import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

class Student{
    String name, major;
    int phone, num;

    Student(){}
    void setName(String name){ this.name = name; }
    void setMajor(String major){ this.major = major; }
    void setPhone(int phone){ this.phone = phone; }
    void setNum(int num){ this.num = num; }

    String getName(){ return this.name; }
    String getMajor(){ return this.major; }
    int getPhone(){ return this.phone; }
    int getNum(){ return this.num; }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < 3;i++){
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int num = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phone = sc.nextInt();

            students[i].setNum(num);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0;i < 3;i++){
            if(i == 0) System.out.print("첫");
            else if(i == 1) System.out.print("두");
            else System.out.print("세");

            System.out.print(
                    "번째 학생: " + students[i].getNum() + " " +
                    students[i].getName() + " " + students[i].getMajor()
                    + " "
            );

            String phone = Integer.toString(students[i].getPhone());
            int len = phone.length(), cnt = 0;
            for(int j = 0;j < 11 - len;j++){
                cnt++;
                System.out.print(0);
                if(cnt == 3 || cnt == 7) System.out.print('-');
            }

            for(int j = 0;j < len;j++){
                cnt++;
                System.out.print(phone.charAt(j));
                if(cnt == 3 || cnt == 7) System.out.print('-');
            }

            System.out.println();
        }
    }
}
