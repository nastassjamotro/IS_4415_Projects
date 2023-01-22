public class VIPMember extends GymMember {
  public VIPMember(int memberFee) {
    super(memberFee);
  }
  
  @Override
  public int payFeeAmount() {
    return membershipFee + 30;
  }
}
