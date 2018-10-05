package jsnes;

final class aba extends afc {
   // $FF: synthetic field
   private adv a;

   private aba(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 23;
   }

   public final void a() {
      this.a.b(2);
      this.a.g(adv.A(this.a) + 1 & '\uffff');
      this.a.f(adv.B(this.a));
      this.a.e();
   }

   // $FF: synthetic method
   aba(adv var1) {
      this(var1, (byte)0);
   }
}
