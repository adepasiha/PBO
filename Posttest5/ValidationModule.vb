Module ValidationModule

    Public Function Validasi(txtKode As TextBox, txtNama As TextBox, txtHarga As TextBox) As Boolean
        If txtKode.Text = "" Or txtNama.Text = "" Or txtHarga.Text = "" Then
            MessageBox.Show("Semua data wajib diisi!")
            Return False
        End If

        If Not IsNumeric(txtHarga.Text) Then
            MessageBox.Show("Harga harus angka!")
            Return False
        End If

        Return True
    End Function

End Module