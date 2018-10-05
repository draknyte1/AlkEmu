package jsnes;

final class ak extends afc {
   // $FF: synthetic field
   private adv a;

   private ak(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 24;
   }

   public final void a() {
      adv.H(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   ak(adv var1) {
      this(var1, (byte)0);
   }
}
