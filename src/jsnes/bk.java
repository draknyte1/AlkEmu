package jsnes;

final class bk extends afc {
   // $FF: synthetic field
   private adv a;

   private bk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      int var1 = this.a.c;
      int var2 = this.a.c - 1 & 255;
      this.a.c = var1 & '\uff00' | var2;
      this.a.i(var2);
      this.a.g();
   }

   // $FF: synthetic method
   bk(adv var1) {
      this(var1, (byte)0);
   }
}
