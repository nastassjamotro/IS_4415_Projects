public class DiscountedMember extends GymMember {
  public DiscountedMember (int memberFee) {
    super(memberFee);
  }
  
  @Override
  public int payFeeAmount() {
    return membershipFee - 20;
  }
}
