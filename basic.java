class bank {
    String s;
    int inr;
    public void show()
    {
        System.out.println(s+" "+inr);
      }
 }
class sbi extends bank{
    sbi(String s,int inr){
        this.s=s;
        this.inr=inr;
    }
    /* public void show()
    {
        System.out.println(s+" "+inr);
    } */


}
class icic extends bank{
    icic(String s,int inr){
        this.s=s;
        this.inr=inr;
    }
    /*public void show()
    {
        System.out.println(s+" "+inr);
      }*/
 }
class axis extends bank{
    axis(String s,int inr){
        this.s=s;
        this.inr=inr;
    }

   /* public void show()
    {
        System.out.println(s+" "+inr);
      }*/
}
class basic {
    public static void main(String[] args) {
        sbi o = new sbi("sbi",8);
        o.show();
        icic o1 = new icic("icici",7);
        o1.show();
        axis o2 = new axis("axis",6);
        o2.show();
    }
}