package jsnes;

final class adb extends afc {
   // $FF: synthetic field
   private adv a;

   private adb(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      adv.O(this.a, 0);
   }

   // $FF: synthetic method
   adb(adv var1) {
      this(var1, (byte)0);
   }
}
