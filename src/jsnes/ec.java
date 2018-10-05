package jsnes;

final class ec extends afc {
   // $FF: synthetic field
   private adv a;

   private ec(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
   }

   public final void a() {
      adv.M(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   ec(adv var1) {
      this(var1, (byte)0);
   }
}
