package jsnes;

final class aae extends afc {
   // $FF: synthetic field
   private adv a;

   private aae(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      this.a.j(this.a.d = this.a.d - 1 & '\uffff');
      this.a.g();
   }

   // $FF: synthetic method
   aae(adv var1) {
      this(var1, (byte)0);
   }
}
