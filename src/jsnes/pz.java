package jsnes;

final class pz implements Runnable {
   // $FF: synthetic field
   private zy a;

   pz(zy var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      this.a.fireTableDataChanged();
   }
}
