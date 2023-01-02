package main

import "fmt"

func main() {
	fmt.Println(palindrome("kasur rusak"))
	fmt.Println(palindrome("kasur"))

}

func palindrome(input string) string {
	message := "its not palindrome"
	for i := 0; i < len(input)/2; i++ {
		if input[i] == input[len(input)-1-i] {
			message = "its palindrome"
		}
	}
	return message
}
