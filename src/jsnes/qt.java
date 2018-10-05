package jsnes;

final class qt extends jp {
   // $FF: synthetic field
   private adv a;

   qt(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Index X";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)this.a.d;
   }

   final void a(long var1) {
      this.a.d = (int)var1 & '\uffff';
   }
}
