fun main() {
    val amount = 10150 * 100
    val commission = 0.75
    val transferFee = if (amount / 100 * commission < 3500) 3500 else amount / 100 * commission

    println("������� �� ����� $amount ���., �������� �������� $transferFee ���.")

}