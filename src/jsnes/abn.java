package jsnes;

final class abn extends afc {
   // $FF: synthetic field
   private adv a;

   private abn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 22;
   }

   public final void a() {
      int var1 = adv.v(this.a);
      this.a.g();
      adv.g(this.a, this.a.h + var1 & '\uffff');
   }

   // $FF: synthetic method
   abn(adv var1) {
      this(var1, (byte)0);
   }
}
