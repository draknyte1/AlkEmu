package jsnes;

final class do extends afc {
   // $FF: synthetic field
   private adv a;

   private do(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 10;
   }

   public final void a() {
      int var1 = adv.y(this.a);
      adv.g(this.a, this.a.h - 1 & '\uffff');
      this.a.g(var1);
      this.a.g();
      this.a.d();
   }

   // $FF: synthetic method
   do(adv var1) {
      this(var1, (byte)0);
   }
}
