package jsnes;

final class fk extends afg {
   // $FF: synthetic field
   private kt a;

   private fk(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 30;
   }

   public final void a() {
      kt.a(this.a, 3);
      kt.a(this.a, (kt.h(this.a) & 128) != 0);
   }

   // $FF: synthetic method
   fk(kt var1) {
      this(var1, (byte)0);
   }
}
