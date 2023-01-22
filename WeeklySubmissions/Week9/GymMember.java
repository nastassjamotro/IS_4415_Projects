pubic class GymMember {
  protected int membershipFee = 0;
  
  public GymMember (int memberFee) {
    membershipFee = memberFee;
  }
  
  public int payFeeAmount() {
    return membershipFee;
  }
}
