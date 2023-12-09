SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;
# WHERE LENGTH(content) > 15;