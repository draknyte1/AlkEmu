package jsnes;

final class qh extends jp {
   // $FF: synthetic field
   private adv a;

   qh(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Accumulator";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)this.a.c;
   }

   final void a(long var1) {
      this.a.c = (int)var1 & '\uffff';
   }
}
