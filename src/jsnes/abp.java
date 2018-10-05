package jsnes;

final class abp extends afc {
   // $FF: synthetic field
   private adv a;

   private abp(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 23;
   }

   public final void a() {
      this.a.b(3);
      this.a.g(adv.A(this.a) + 1 & '\uffff');
      this.a.e();
   }

   // $FF: synthetic method
   abp(adv var1) {
      this(var1, (byte)0);
   }
}
