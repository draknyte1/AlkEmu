package jsnes;

final class qr extends afc {
   // $FF: synthetic field
   private adv a;

   private qr(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 23;
   }

   public final void a() {
      this.a.b(2);
      int var1 = adv.B(this.a);
      this.a.c = this.a.c & '\uff00' | var1;
      this.a.i(var1);
   }

   // $FF: synthetic method
   qr(adv var1) {
      this(var1, (byte)0);
   }
}
