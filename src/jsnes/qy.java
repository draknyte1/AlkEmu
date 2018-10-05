package jsnes;

final class qy extends jp {
   // $FF: synthetic field
   private adv a;

   qy(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Direct Page";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)this.a.f;
   }

   final void a(long var1) {
      this.a.f = (int)var1 & '\uffff';
   }
}
