package jsnes;

final class aac extends afc {
   // $FF: synthetic field
   private adv a;

   private aac(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      this.a.j(this.a.e = this.a.e + 1 & '\uffff');
      this.a.g();
   }

   // $FF: synthetic method
   aac(adv var1) {
      this(var1, (byte)0);
   }
}
