package jsnes;

final class sk extends afc {
   // $FF: synthetic field
   private adv a;

   private sk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      adv.g(this.a, this.a.h - 1 & '\uffff');
      this.a.g(var1);
      this.a.g();
      this.a.d();
   }

   // $FF: synthetic method
   sk(adv var1) {
      this(var1, (byte)0);
   }
}
