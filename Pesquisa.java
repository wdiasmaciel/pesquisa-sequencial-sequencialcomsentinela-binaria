public class Pesquisa {

    public int sequencial(int[] a, int v, int l, int r) {
        for (int i = l; i <= r; i++)
            if (a[i] == v)
                return i;
        return -1;
    }

    public int sequencialComSentinela(int[] a, int v, int l, int r) {
        int i, n = r + 1;

        a[n] = v;

        for (i = l; v != a[i]; i++)
            ;

        if (i < n)
            return (i); /* Chave encontrada! */
        else
            return (-1); /* Sentinela encontrada. */
    }

    public int binaria(int[] a, int v, int l, int r) {
        while (l <= r) {
            int m = (l + r) / 2;

            if (a[m] == v)
                return m;
            if (a[m] > v)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }
}