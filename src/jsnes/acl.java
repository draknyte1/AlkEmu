package jsnes;

final class acl extends afc {
   // $FF: synthetic field
   private adv a;

   private acl(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.s(this.a, this.a.c);
   }

   // $FF: synthetic method
   acl(adv var1) {
      this(var1, (byte)0);
   }
}
