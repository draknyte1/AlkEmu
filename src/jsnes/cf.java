package jsnes;

final class cf extends afc {
   // $FF: synthetic field
   private adv a;

   private cf(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.U(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   cf(adv var1) {
      this(var1, (byte)0);
   }
}
