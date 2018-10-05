package jsnes;

final class fd extends afg {
   // $FF: synthetic field
   private kt a;

   private fd(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 4;
   }

   public final void a() {
      kt.c(this.a, kt.c(this.a, kt.c(this.a) - 1 & 255));
      kt.a(this.a, 2);
   }

   // $FF: synthetic method
   fd(kt var1) {
      this(var1, (byte)0);
   }
}
