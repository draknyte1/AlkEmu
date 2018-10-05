package jsnes;

final class gc extends afg {
   // $FF: synthetic field
   private kt a;

   private gc(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      kt.b(this.a, kt.c(this.a) * kt.a(this.a) & '\uffff');
      kt.c(this.a, kt.c(this.a));
      kt.a(this.a, 9);
   }

   // $FF: synthetic method
   gc(kt var1) {
      this(var1, (byte)0);
   }
}
