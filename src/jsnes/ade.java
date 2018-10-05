package jsnes;

final class ade extends afc {
   // $FF: synthetic field
   private adv a;

   private ade(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 22;
   }

   public final void a() {
      int var1 = adv.v(this.a);
      this.a.g(this.a.h + var1 & '\uffff');
      this.a.g();
   }

   // $FF: synthetic method
   ade(adv var1) {
      this(var1, (byte)0);
   }
}
