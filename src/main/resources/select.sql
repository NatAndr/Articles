SELECT
  s.name       AS Article_Name,
  count(t.id)  AS Count_Official_Text,
  count(tt.id) AS Count_English_Text
FROM articles s
  LEFT JOIN article_link k ON s.id = k.article1_id
  LEFT JOIN articles t ON k.article2_id = t.id AND t.typeid = 4
  LEFT JOIN articles tt ON k.article2_id = tt.id AND tt.typeid = 5
WHERE s.typeid = 1
GROUP BY s.name
ORDER BY s.name
