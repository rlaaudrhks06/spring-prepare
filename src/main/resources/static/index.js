function calculate()
{
    // 상품 정보 값 가져오기
    const sp = document.getElementById('sp').value;  // 판매 가격
    const de1 = document.getElementById('de1').value; // 배송비

    // 매입 정보 값 가져오기
    const pur1 = document.getElementById('pur1').value; // 매입 가격
    const pur2 = document.getElementById('pur2').value; // 매입 가격 운송비
    const de2 = document.getElementById('de2').value; // 판매자 부담 배송비

    //마켓 수수료 값 가져오기
    const item1 = document.getElementById('item1').value; // 마켓연도 수수료
    const item2 = document.getElementById('item2').value; // 기타 수수료
    const other = document.getElementById('other').value; // 기타 비용

    // 계산용 변수
    const charge1 = parseInt(item1) + parseInt(item2); // 수수료 더하기
    const charge2 = (100 - charge1)/100; // 수수료를 제외했을 떄의 백분율
    const spc = parseInt(sp) * charge2 + parseInt(de1) - parseInt(other); // 총 판매가
    const cost = parseInt(pur1) + parseInt(pur2) + parseInt(de2); // 원가

    // 마진 계산
    const mar = spc - cost; // 마진
    const pmar = 1 - (cost/spc); //마진율

    // html div에 출력
    document.getElementById("result1").innerText = mar; // 마진
    document.getElementById("result2").innerText = pmar; // 마진률
}
