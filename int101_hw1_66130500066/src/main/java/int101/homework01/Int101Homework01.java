package int101.homework01;
import work03.MyUtil;
import work04.Person;
import work04.BankAccount;
public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6;
       System.out.println("Work01:Answer: b = " + b);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6));
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = v1 << v2 < v3 != v3 > (v4 ^ v5 | v6);
       System.out.println("Work02: Question: b = " + b);
    }

   static void work03UseOfUtilityClass() {
        // calculateBMI
       System.out.println("Your BMI is : " + work03.MyUtil.calculateBMI(45,1.61));
       // Average
       System.out.println("Average is : " + work03.MyUtil.average(4,4,4));
   }

   static void work04UseOfObjectClass() {
        // person A
        Person personA = new Person(1);
        BankAccount bankAccount1 = new BankAccount(1,personA);

       // person B
        Person personB = new Person(2);
        BankAccount bankAccount2 = new BankAccount(2,personB);

        //deposit
       bankAccount1.deposit(15000);
       bankAccount2.deposit(30000);

       //withdraw
       bankAccount1.withdraw(1000);
       bankAccount2.withdraw(2000);

       //transfer
       bankAccount1.transfer(1500,bankAccount2);

       //Display person A
       System.out.println(personA.toString());
       System.out.println(bankAccount1.toString());
       System.out.println("Your Balance is " + bankAccount1.getBalance());

        //Display person B
       System.out.println(personB.toString());
       System.out.println(bankAccount2.toString());
       System.out.println("Your Balance is " + bankAccount2.getBalance());
   }
}
