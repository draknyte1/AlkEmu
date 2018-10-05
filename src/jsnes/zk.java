package jsnes;

final class zk extends afc {
   // $FF: synthetic field
   private adv a;

   private zk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 9;
   }

   public final void a() {
      int var1 = adv.w(this.a);
      this.a.g(var1 & '\uffff');
      this.a.f(var1 >> 16);
   }

   // $FF: synthetic method
   zk(adv var1) {
      this(var1, (byte)0);
   }
}
