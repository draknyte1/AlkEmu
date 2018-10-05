package jsnes;

final class sv extends afc {
   // $FF: synthetic field
   private adv a;

   private sv(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 23;
   }

   public final void a() {
      this.a.b(2);
      adv.c(this.a);
   }

   // $FF: synthetic method
   sv(adv var1) {
      this(var1, (byte)0);
   }
}
