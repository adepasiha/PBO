Imports MySqlConnector

Module DataModule

    ' TAMPIL DATA
    Public Function GetAllData() As DataTable
        Dim dt As New DataTable()

        Try
            Dim query As String = "SELECT * FROM tbservice ORDER BY kodeService ASC"

            Using conn As MySqlConnection = GetConnection()
                Using da As New MySqlDataAdapter(query, conn)
                    da.Fill(dt)
                End Using
            End Using

        Catch ex As Exception
            MessageBox.Show("Gagal tampil: " & ex.Message)
        End Try

        Return dt
    End Function

    ' SEARCH
    Public Function SearchData(keyword As String) As DataTable
        Dim dt As New DataTable()

        Try
            Dim query As String =
                "SELECT * FROM tbservice WHERE kodeService LIKE @key OR namaService LIKE @key"

            Using conn As MySqlConnection = GetConnection()
                Using da As New MySqlDataAdapter(query, conn)
                    da.SelectCommand.Parameters.AddWithValue("@key", "%" & keyword & "%")
                    da.Fill(dt)
                End Using
            End Using

        Catch ex As Exception
            MessageBox.Show("Gagal search: " & ex.Message)
        End Try

        Return dt
    End Function

    ' SIMPAN
    Public Function SimpanData(kode As String, nama As String, harga As Integer) As Boolean
        Try
            Dim query As String = "INSERT INTO tbservice VALUES (@kode,@nama,@harga)"

            Using conn As MySqlConnection = GetConnection()
                conn.Open()

                Using cmd As New MySqlCommand(query, conn)
                    cmd.Parameters.AddWithValue("@kode", kode)
                    cmd.Parameters.AddWithValue("@nama", nama)
                    cmd.Parameters.AddWithValue("@harga", harga)
                    cmd.ExecuteNonQuery()
                End Using
            End Using

            Return True

        Catch ex As Exception
            MessageBox.Show("Gagal simpan: " & ex.Message)
            Return False
        End Try
    End Function

    ' UPDATE
    Public Function UbahData(kode As String, nama As String, harga As Integer) As Boolean
        Try
            Dim query As String =
                "UPDATE tbservice SET namaService=@nama, harga=@harga WHERE kodeService=@kode"

            Using conn As MySqlConnection = GetConnection()
                conn.Open()

                Using cmd As New MySqlCommand(query, conn)
                    cmd.Parameters.AddWithValue("@kode", kode)
                    cmd.Parameters.AddWithValue("@nama", nama)
                    cmd.Parameters.AddWithValue("@harga", harga)
                    Return cmd.ExecuteNonQuery() > 0
                End Using
            End Using

        Catch ex As Exception
            MessageBox.Show("Gagal ubah: " & ex.Message)
            Return False
        End Try
    End Function

    ' HAPUS
    Public Function HapusData(kode As String) As Boolean
        Try
            Dim query As String = "DELETE FROM tbservice WHERE kodeService=@kode"

            Using conn As MySqlConnection = GetConnection()
                conn.Open()

                Using cmd As New MySqlCommand(query, conn)
                    cmd.Parameters.AddWithValue("@kode", kode)
                    Return cmd.ExecuteNonQuery() > 0
                End Using
            End Using

        Catch ex As Exception
            MessageBox.Show("Gagal hapus: " & ex.Message)
            Return False
        End Try
    End Function

End Module