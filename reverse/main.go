package main

import "fmt"

func main() {
	fmt.Println(reverse("rihdomp"))
}

func reverse(input string) string {
	var rvs string
	for i := 0; i < len(input); i++ {
		rvs += string(input[len(input)-1-i])
	}
	return rvs
}
