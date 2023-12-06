function fibonacci(n) {
    if (n <= 1) return n;
    let a = 0, b = 1, sum;
    for (let i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
    }
    return b;
}
