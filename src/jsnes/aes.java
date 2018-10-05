package jsnes;

final class aes extends afc {
   // $FF: synthetic field
   private adv a;

   private aes(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.x(this.a, this.a.c);
   }

   // $FF: synthetic method
   aes(adv var1) {
      this(var1, (byte)0);
   }
}
