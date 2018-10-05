package jsnes;

final class p extends afc {
   // $FF: synthetic field
   private adv a;

   private p(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      int var1 = this.a.c;
      this.a.c = var1 & '\uff00' | adv.j(this.a, var1 & 255);
      this.a.g();
   }

   // $FF: synthetic method
   p(adv var1) {
      this(var1, (byte)0);
   }
}
