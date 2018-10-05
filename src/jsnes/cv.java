package jsnes;

final class cv extends afc {
   // $FF: synthetic field
   private adv a;

   private cv(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      int var1 = this.a.c;
      int var2 = this.a.c & 255;
      var1 >>= 8;
      this.a.c = var2 << 8 | var1;
      this.a.i(var1);
      this.a.b(2);
   }

   // $FF: synthetic method
   cv(adv var1) {
      this(var1, (byte)0);
   }
}
