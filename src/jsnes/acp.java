package jsnes;

final class acp extends afc {
   // $FF: synthetic field
   private adv a;

   private acp(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      this.a.i(this.a.e = this.a.c & 255);
      this.a.g();
   }

   // $FF: synthetic method
   acp(adv var1) {
      this(var1, (byte)0);
   }
}
