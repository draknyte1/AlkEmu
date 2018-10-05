package jsnes;

final class acy extends afc {
   // $FF: synthetic field
   private adv a;

   private acy(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      int var1 = this.a.c;
      this.a.c = var1 & '\uff00' | adv.o(this.a, var1 & 255);
      this.a.g();
   }

   // $FF: synthetic method
   acy(adv var1) {
      this(var1, (byte)0);
   }
}
