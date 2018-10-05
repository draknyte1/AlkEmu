package jsnes;

final class dp extends afc {
   // $FF: synthetic field
   private adv a;

   private dp(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      boolean var1 = this.a.c;
      this.a.c = this.a.i;
      this.a.i = var1;
      if (var1) {
         this.a.f = true;
         this.a.g = true;
         this.a.d &= 255;
         this.a.e &= 255;
         this.a.g = 256 | this.a.g & 255;
      }

      this.a.m();
      this.a.g();
   }

   // $FF: synthetic method
   dp(adv var1) {
      this(var1, (byte)0);
   }
}
