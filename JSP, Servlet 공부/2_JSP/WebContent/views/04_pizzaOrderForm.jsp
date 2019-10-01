<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border: 1px solid black;
		border-collapse : collapse;
	}
	th, td{
		border: 1px solid black;
		padding: 10px;
		text-align: center;
	}
</style>
</head>
<body>
	<h1>오늘의 시간</h1>
	<%@ include file="today.jsp" %>
	<form action="/2_JSP/confirmPizza" method="post">
		<table>
			<tr>
				<th>종류</th>
				<th>이름</th>
				<th>가격</th>
				<th>체크</th>
			</tr>
			<tr>
				<td rowspan="5">피자</td>
				<td>치즈피자</td>
				<td>5000</td>
				<td><input type="radio" name="pizza" value="치즈피자"></td>
			</tr>
			<tr>
				<td>콤비네이션피자</td>
				<td>6000</td>
				<td><input type="radio" name="pizza" value="콤비네이션피자"></td>
			</tr>
			<tr>
				<td>포테이토피자</td>
				<td>7000</td>
				<td><input type="radio" name="pizza" value="포테이토피자"></td>
			</tr>
			<tr>
				<td>고구마피자</td>
				<td>8000</td>
				<td><input type="radio" name="pizza" value="고구마피자"></td>
			</tr>
			<tr>
				<td>불고기피자</td>
				<td>9000</td>
				<td><input type="radio" name="pizza" value="불고기피자"></td>
			</tr>
			<tr>
				<td rowspan="6">토핑</td>
				<td>고무마무스</td>
				<td>1000</td>
				<td><input type="checkbox" name="topping" value="고구마무스"></td>
			</tr>
			<tr>
				<td>콘크림무스</td>
				<td>1500</td>
				<td><input type="checkbox" name="topping" value="콘크림무스"></td>
			</tr>
			<tr>
				<td>파인애플토핑</td>
				<td>2000</td>
				<td><input type="checkbox" name="topping" value="파인애플토핑"></td>
			</tr>
			<tr>
				<td>치즈토핑</td>
				<td>2000</td>	
				<td><input type="checkbox" name="topping" value="치즈토핑"></td>
			</tr>
			<tr>
				<td>치즈크러스트</td>
				<td>2000</td>
				<td><input type="checkbox" name="topping" value="치즈크러스트"></td>
			</tr>
			<tr>
				<td>치즈바이트</td>
				<td>3000</td>
				<td><input type="checkbox" name="topping" value="치즈바이트"></td>
			</tr>
		</table>
		<input type="submit">확인
	</form>
</body>
</html>