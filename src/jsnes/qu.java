package jsnes;

final class qu extends jp {
   // $FF: synthetic field
   private adv a;

   qu(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Index Y";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)this.a.e;
   }

   final void a(long var1) {
      this.a.e = (int)var1 & '\uffff';
   }
}
