package jsnes;

final class tv extends afc {
   // $FF: synthetic field
   private adv a;

   private tv(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      this.a.j(this.a.c = this.a.c - 1 & '\uffff');
      this.a.g();
   }

   // $FF: synthetic method
   tv(adv var1) {
      this(var1, (byte)0);
   }
}
