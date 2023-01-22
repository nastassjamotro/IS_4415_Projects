public class Main {
  public static void main(String args[]) {
    GymMember regularMember = new GymMember(50);
    GymMember VIPMember = new VIPMember(50);
    GymMember cheapMember = new DiscountedMember(50);
    
    System.out.println("Regular = " + regularMember.payFeeAmount());
    System.out.println("VIP = " + VIPMember.payFeeAmount());
    System.out.println("Discounted = " cheapMember.payFeeAmount());
  }
}
