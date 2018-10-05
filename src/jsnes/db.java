package jsnes;

final class db extends afc {
   // $FF: synthetic field
   private adv a;

   private db(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.Q(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   db(adv var1) {
      this(var1, (byte)0);
   }
}
