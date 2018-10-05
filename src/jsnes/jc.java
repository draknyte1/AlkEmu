package jsnes;

final class jc extends afc {
   // $FF: synthetic field
   private adv a;

   private jc(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.k(this.a, var1);
      this.a.b((var2 & this.a.c) == 0);
      var2 = var2 & ~this.a.c & 255;
      this.a.g();
      adv.g(this.a, var1, var2);
   }

   // $FF: synthetic method
   jc(adv var1) {
      this(var1, (byte)0);
   }
}
