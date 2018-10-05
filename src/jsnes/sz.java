package jsnes;

final class sz extends afc {
   // $FF: synthetic field
   private adv a;

   private sz(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      int var1 = this.a.e & 255;
      this.a.c = this.a.c & '\uff00' | var1;
      this.a.i(var1);
      this.a.g();
   }

   // $FF: synthetic method
   sz(adv var1) {
      this(var1, (byte)0);
   }
}
